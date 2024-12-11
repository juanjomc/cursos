document.addEventListener("DOMContentLoaded", function() {

    // Validar el formulario de búsqueda antes de enviarlo
    const form = document.querySelector("form");
    form.addEventListener("submit", function(event) {
        const input = document.querySelector("input[name='nombre']");
        if (input.value.trim() === "") {
            alert("Por favor, ingrese un nombre para buscar.");
            event.preventDefault(); // Evitar que el formulario se envíe
        } else {
            alert("Buscando juegos...");
        }
    });

    // Agregar efectos visuales a los elementos de la lista
    const listItems = document.querySelectorAll("ul li");
    listItems.forEach(function(item) {
        item.addEventListener("mouseover", function() {
            item.style.backgroundColor = "#f0f0f0";
        });
        item.addEventListener("mouseout", function() {
            item.style.backgroundColor = "#fff";
        });
    });
});