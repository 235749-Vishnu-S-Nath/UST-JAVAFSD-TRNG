var name = "Vishnu";
console.log(name);
function check(){
    var x = 100;
    console.log(x);
}
check();

function one(){
    var num1 = 30;
    var num2 = 20;
    var res = num1>num2? "\nYes 30 greater than 20":"Not greater";
    console.log(res);
}

function two(){
    var $var12 = 200;
    function example(){
        var $var12 = 300;
        console.log("Inside example() function= "+$var12);
    }
    console.log("\nOutside example() function= "+$var12);
    example();
}

function three(){
    var i;
    console.log("\n");
    for(i=1;i<=10;i++){
        console.log("2x"+i+"= "+2*i);
    }
}

function four(){
    var num=20;
    console.log("\n");
    if(num>10){
        if(num%2==0)
            console.log(num+" is greater than 10 and even");
        else
            console.log(num+" is greater than 10 and odd");
    }
    else{
        console.log(num+" is smaller than 10");
    }
    console.log("After nested if statment")
}

one();
two();
three();
four();