const searchInput = document.querySelector(".input");
const itemName = document.querySelector(".item-name");
const itemContainer = document.querySelectorAll(".item-container");
const mainContent = document.querySelector(".main-content");
const onChangeInput = document.getElementById("input");
onChangeInput.addEventListener("change", (event) => {
    const currentWord = onChangeInput.value.toUpperCase();
    const allContainers = [...itemContainer];
//    let result = itemName;
    console.log(allContainers);
    const filteredContainers = allContainers.filter(container => container.textContent.toUpperCase().includes(currentWord));
    mainContent.textContent = "";
    filteredContainers.forEach(container => mainContent.appendChild(container ));

});
//document.querySelector(".interval").innerHTML = `https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.shutterstock.com%2Fimage-vector%2Fwelcome-poster-spectrum-brush-strokes-260nw-1146069941.jpg&tbnid=x2tw04iHmein1M&vet=12ahUKEwiuxpzxkN7-AhVNvSoKHVlzCVQQMygBegUIARDCAQ..i&imgrefurl=https%3A%2F%2Fwww.shutterstock.com%2Fsearch%2Fwelcome&docid=sSYd5x4bkIAjWM&w=571&h=280&q=welcome&ved=2ahUKEwiuxpzxkN7-AhVNvSoKHVlzCVQQMygBegUIARDCAQ`;
//app.use('/static', express.static('static'));
//app.use('/static', express.static('./static'));
