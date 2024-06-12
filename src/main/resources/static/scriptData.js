var dataAtual = new Date();
var dateTimeString = dataAtual.toISOString();
var formattedDateTimeString = dataAtual.toLocaleString();
var timeElement = document.getElementById("current-time");
timeElement.textContent = formattedDateTimeString;
timeElement.setAttribute("datetime", dateTimeString);