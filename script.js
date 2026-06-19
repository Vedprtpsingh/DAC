// ============================================
// DOM ELEMENTS
// ============================================

const themeToggle = document.getElementById('theme-toggle');
const hamburger = document.getElementById('hamburger');
const mobileMenu = document.getElementById('mobile-menu');
const navLinks = document.querySelectorAll('.nav-link');
const mobileLinks = document.querySelectorAll('.mobile-link');
const loadingScreen = document.getElementById('loading-screen');
const contactForm = document.getElementById('contact-form');
const typingText = document.querySelector('.typing-text');
const statNumbers = document.querySelectorAll('[data-count]');

// ============================================
// TYPING ANIMATION
// ============================================

const typingWords = [
    'Data Analyst',
    'Data Engineer',
    'Power BI Developer',
    'Big Data Enthusiast',
    'Machine Learning Practitioner'
];

let wordIndex = 0;
let charIndex = 0;
let isDeleting = false;

function typeAnimation() {
    const currentWord = typingWords[wordIndex];
    
    if (isDeleting) {
        charIndex--;
    } else {
        charIndex++;
    }
    
    typingText.textContent = currentWord.substring(0, charIndex);
    
    let speed = isDeleting ? 50 : 100;
    
    if (!isDeleting && charIndex === currentWord.length) {
        speed = 2000;
        isDeleting = true;
    } else if (isDeleting && charIndex === 0) {
        isDeleting = false;
        wordIndex = (wordIndex + 1) % typingWords.length;
        speed = 500;
    }
    
    setTimeout(typeAnimation, speed);
}

// ============================================
// THEME TOGGLE
// ============================================

function initTheme() {
    const savedTheme = localStorage.getItem('theme') || 'light';
    setTheme(savedTheme);
}

function setTheme(theme) {
    document.body.classList.remove('light-mode', 'dark-mode');
    document.body.classList.add(theme + '-mode');
    localStorage.setItem('theme', theme);
    updateThemeIcon(theme);
}

function updateThemeIcon(theme) {
    themeToggle.querySelector('.theme-icon').textContent = theme === 'dark' ? '☀️' : '🌙';
}

themeToggle.addEventListener('click', () => {
    const currentTheme = localStorage.getItem('theme') || 'light';
    const newTheme = currentTheme === 'dark' ? 'light' : 'dark';
    setTheme(newTheme);
});

// ============================================
// MOBILE MENU TOGGLE
// ============================================

hamburger.addEventListener('click', () => {
    hamburger.classList.toggle('active');
    mobileMenu.classList.toggle('active');
});

// Close mobile menu when link is clicked
[...navLinks, ...mobileLinks].forEach(link => {
    link.addEventListener('click', () => {
        hamburger.classList.remove('active');
        mobileMenu.classList.remove('active');
    });
});

// ============================================
// SMOOTH SCROLLING
// ============================================

document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', (e) => {
        const href = anchor.getAttribute('href');
        if (href !== '#' && document.querySelector(href)) {
            e.preventDefault();
            document.querySelector(href).scrollIntoView({
                behavior: 'smooth',
                block: 'start'
            });
        }
    });
});

// ============================================
// LOADING SCREEN
// ============================================

window.addEventListener('load', () => {
    setTimeout(() => {
        loadingScreen.style.display = 'none';
    }, 2500);
});

// ============================================
// ANIMATED COUNTER
// ============================================

function animateCounter(element) {
    const target = parseInt(element.getAttribute('data-count'));
    let current = 0;
    const increment = target / 50;
    
    const counter = setInterval(() => {
        current += increment;
        if (current >= target) {
            element.textContent = target;
            clearInterval(counter);
        } else {
            element.textContent = Math.ceil(current);
        }
    }, 30);
}

// Intersection Observer for counter animation
const observerOptions = {
    threshold: 0.5,
    rootMargin: '0px'
};

const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            const statNumbers = entry.target.querySelectorAll('[data-count]');
            statNumbers.forEach(stat => {
                if (!stat.classList.contains('counted')) {
                    animateCounter(stat);
                    stat.classList.add('counted');
                }
            });
            observer.unobserve(entry.target);
        }
    });
}, observerOptions);

const statsSection = document.querySelector('.stats');
if (statsSection) {
    observer.observe(statsSection);
}

// ============================================
// SCROLL REVEAL EFFECTS
// ============================================

const revealElements = document.querySelectorAll(
    '.about-text p, .highlight-card, .project-card, .education-card, .certification-card, .skill-category'
);

const revealObserver = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.style.animation = 'slideInLeft 0.6s ease-out forwards';
            revealObserver.unobserve(entry.target);
        }
    });
}, { threshold: 0.2 });

revealElements.forEach(el => revealObserver.observe(el));

// ============================================
// CONTACT FORM VALIDATION
// ============================================

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}

function validateForm() {
    const name = document.getElementById('name');
    const email = document.getElementById('email');
    const subject = document.getElementById('subject');
    const message = document.getElementById('message');
    
    let isValid = true;
    
    [name, email, subject, message].forEach(field => {
        field.parentElement.classList.remove('error');
        field.parentElement.querySelector('.error-message').textContent = '';
    });
    
    if (name.value.trim().length < 2) {
        showError(name, 'Name must be at least 2 characters');
        isValid = false;
    }
    
    if (!validateEmail(email.value.trim())) {
        showError(email, 'Please enter a valid email');
        isValid = false;
    }
    
    if (subject.value.trim().length < 3) {
        showError(subject, 'Subject must be at least 3 characters');
        isValid = false;
    }
    
    if (message.value.trim().length < 10) {
        showError(message, 'Message must be at least 10 characters');
        isValid = false;
    }
    
    return isValid;
}

function showError(field, message) {
    field.parentElement.classList.add('error');
    field.parentElement.querySelector('.error-message').textContent = message;
}

contactForm.addEventListener('submit', (e) => {
    e.preventDefault();
    
    if (validateForm()) {
        // Simulate form submission
        const submitBtn = contactForm.querySelector('button[type="submit"]');
        const originalText = submitBtn.textContent;
        submitBtn.textContent = 'Message Sent! ✓';
        submitBtn.disabled = true;
        
        // Reset form
        contactForm.reset();
        
        // Reset button after 3 seconds
        setTimeout(() => {
            submitBtn.textContent = originalText;
            submitBtn.disabled = false;
        }, 3000);
        
        // Log form data (in real app, send to server)
        console.log({
            name: document.getElementById('name').value,
            email: document.getElementById('email').value,
            subject: document.getElementById('subject').value,
            message: document.getElementById('message').value
        });
    }
});

// ============================================
// ACTIVE NAV LINK ON SCROLL
// ============================================

window.addEventListener('scroll', () => {
    let current = '';
    
    const sections = document.querySelectorAll('section');
    sections.forEach(section => {
        const sectionTop = section.offsetTop;
        const sectionHeight = section.clientHeight;
        if (pageYOffset >= sectionTop - 200) {
            current = section.getAttribute('id');
        }
    });
    
    navLinks.forEach(link => {
        link.classList.remove('active');
        if (link.getAttribute('data-section') === current) {
            link.classList.add('active');
        }
    });
});

// Add active style for nav links
const style = document.createElement('style');
style.textContent = `
    .nav-link.active::after {
        width: 100%;
    }
`;
document.head.appendChild(style);

// ============================================
// PARALLAX EFFECT
// ============================================

window.addEventListener('scroll', () => {
    const hero = document.querySelector('.hero');
    const particles = document.querySelectorAll('.particle');
    
    if (window.scrollY < window.innerHeight) {
        const offset = window.scrollY * 0.5;
        particles.forEach((particle, index) => {
            particle.style.transform = `translate(${offset}px, ${offset * (index + 1) * 0.1}px)`;
        });
    }
});

// ============================================
// INITIALIZATION
// ============================================

document.addEventListener('DOMContentLoaded', () => {
    initTheme();
    typeAnimation();
    
    // Add animation styles to document
    const animationStyles = document.createElement('style');
    animationStyles.textContent = `
        @keyframes slideInLeft {
            from {
                opacity: 0;
                transform: translateX(-30px);
            }
            to {
                opacity: 1;
                transform: translateX(0);
            }
        }
    `;
    document.head.appendChild(animationStyles);
});

// ============================================
// KEYBOARD SHORTCUTS
// ============================================

document.addEventListener('keydown', (e) => {
    // Alt + D: Dark mode toggle
    if (e.altKey && e.key === 'd') {
        themeToggle.click();
    }
    
    // Alt + T: Scroll to top
    if (e.altKey && e.key === 't') {
        window.scrollTo({ top: 0, behavior: 'smooth' });
    }
});

// ============================================
// PROGRESSIVE ENHANCEMENT
// ============================================

// Download Resume functionality
const resumeDownloadBtn = document.querySelector('.resume-actions .btn-primary');
if (resumeDownloadBtn) {
    resumeDownloadBtn.addEventListener('click', (e) => {
        // In a real scenario, this would download an actual PDF
        console.log('Downloading resume...');
        // For now, just prevent default
        e.preventDefault();
    });
}

// ============================================
// PERFORMANCE OPTIMIZATION
// ============================================

// Lazy loading images
if ('IntersectionObserver' in window) {
    const images = document.querySelectorAll('img');
    const imageObserver = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                const img = entry.target;
                img.src = img.dataset.src || img.src;
                img.classList.add('loaded');
                imageObserver.unobserve(img);
            }
        });
    });
    
    images.forEach(img => imageObserver.observe(img));
}

// ============================================
// ACCESSIBILITY ENHANCEMENTS
// ============================================

// Skip to main content link
const skipLink = document.createElement('a');
skipLink.href = '#home';
skipLink.className = 'skip-link';
skipLink.textContent = 'Skip to main content';
skipLink.style.cssText = `
    position: absolute;
    top: -40px;
    left: 0;
    background: #1e3c72;
    color: white;
    padding: 8px;
    text-decoration: none;
    z-index: 100;
`;
skipLink.addEventListener('focus', () => {
    skipLink.style.top = '0';
});
skipLink.addEventListener('blur', () => {
    skipLink.style.top = '-40px';
});
document.body.insertBefore(skipLink, document.body.firstChild);

// Add skip link styles
const skipLinkStyles = document.createElement('style');
skipLinkStyles.textContent = `
    .skip-link:focus {
        top: 0;
        transition: top 0.3s ease;
    }
`;
document.head.appendChild(skipLinkStyles);

// ============================================
// ANALYTICS & TRACKING (Placeholder)
// ============================================

function trackEvent(eventName, eventData = {}) {
    // Placeholder for analytics tracking
    console.log('Event tracked:', eventName, eventData);
}

// Track section views
const sectionObserver = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            trackEvent('section_view', {
                section: entry.target.id,
                timestamp: new Date().toISOString()
            });
        }
    });
}, { threshold: 0.5 });

document.querySelectorAll('section').forEach(section => {
    sectionObserver.observe(section);
});

// ============================================
// ERROR HANDLING
// ============================================

window.addEventListener('error', (e) => {
    console.error('Error caught:', e.error);
});

window.addEventListener('unhandledrejection', (event) => {
    console.error('Unhandled rejection:', event.reason);
});