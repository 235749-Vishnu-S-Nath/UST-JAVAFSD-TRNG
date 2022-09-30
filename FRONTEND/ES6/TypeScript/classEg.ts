class Car{
    engine:string;
    constructor(engine:string){
        this.engine=engine;
    }
    disp():void{
        console.log("Function displays engine is : ",this.engine);
    }
}

var obj1 = new Car("XXSY1");

console.log("reading attribute value Engine as: ",obj1.engine);
obj1.disp();