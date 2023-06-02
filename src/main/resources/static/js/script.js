const searchInput = document.querySelector(".input");
const itemName = document.querySelector(".item-name");
const itemContainer = document.querySelectorAll(".item-container");
const mainContent = document.querySelector(".main-content");
const onChangeInput = document.getElementById("input");
onChangeInput.addEventListener("change", (event) => {
    const currentWord = onChangeInput.value.toUpperCase();
    const allContainers = [...itemContainer];
    console.log(allContainers);
    const filteredContainers = allContainers.filter(container => container.textContent.toUpperCase().includes(currentWord));
    mainContent.textContent = "";
    filteredContainers.forEach(container => mainContent.appendChild(container ));

});

