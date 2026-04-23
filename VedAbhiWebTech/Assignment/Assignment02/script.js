function addSkill() {
  const input = document.getElementById("skillInput");
  const value = input.value.trim();
  if (value === "") return;
  const tag = document.createElement("div");
  tag.className = "skill-tag";
  tag.innerHTML = `
        ${value}
        <span class="remove-btn" onclick="removeSkill(this)">&#10060;</span>
    `;
  document.getElementById("skillsContainer").appendChild(tag);
  input.value = "";
}

function removeSkill(el) {
  el.parentElement.remove();
}
