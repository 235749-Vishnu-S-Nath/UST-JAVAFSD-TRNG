function addNumber() {
    var num = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        num[_i] = arguments[_i];
    }
    var i;
    var sum = 0;
    for (i = 0; i < num.length; i++) {
        sum = sum + num[i];
    }
    console.log("Sum of the numbers: ", sum);
}
addNumber(1, 2, 3);
addNumber(10, 10, 10, 10, 10);
