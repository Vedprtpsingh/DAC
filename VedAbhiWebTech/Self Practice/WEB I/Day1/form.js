// 1. Select the form element
const myForm = document.getElementById('contactForm');

// 2. Listen for the "submit" event
myForm.addEventListener('submit', function(event) {
    // Prevent the default page reload
    event.preventDefault();

    // 3. Capture the data using FormData
    const formData = new FormData(this);
    const data = {
        name: formData.get('user_name'),
        email: formData.get('user_email')
    };

    // 4. "Action" - Sending the data to a server (API)
    // We use fetch() to send data without refreshing the page
    fetch('https://example.com/api/submit', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
    .then(response => {
        if (response.ok) {
            document.getElementById('responseMessage').innerText = "Success! Data sent.";
        } else {
            document.getElementById('responseMessage').innerText = "Oops! Error.";
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });

    // For testing: Log it to your console
    console.log("JS captured this data:", data);
});