document.addEventListener("DOMContentLoaded", function(){
    const display = document.getElementById("display");
    const buttons = document.querySelectorAll(".grid-item input[type = 'button']");

    let displayingValue = "";

    function addToDisplay(value){
       displayingValue += value;
       updateDisplay();   
    }

    function clearDisplay(){
       displayingValue = "";
       updateDisplay();
    }

    function calculate(){
       displayingValue = eval(displayingValue);
       updateDisplay();
    }

    function updateDisplay(){
      display.value = displayingValue;
    }

    buttons.forEach(function(button){

      button.addEventListener("click", function(){

        const buttonValue = button.value;

        if(buttonValue === "AC"){
           clearDisplay();
        }else if(buttonValue === "="){
           calculate();
        }else{
           addToDisplay(buttonValue);
        }

      });
    });
});

  
