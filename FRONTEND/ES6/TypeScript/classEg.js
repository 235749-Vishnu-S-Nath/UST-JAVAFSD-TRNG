var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("Function displays engine is : ", this.engine);
    };
    return Car;
}());
var obj1 = new Car("XXSY1");
console.log("reading attribute value Engine as: ", obj1.engine);
obj1.disp();
