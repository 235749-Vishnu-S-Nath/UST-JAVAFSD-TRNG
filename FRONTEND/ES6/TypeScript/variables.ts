var g_num = 12;
class Numbers{
    num_val=13;
    static sval=10;
    storeNum():void{
        var local_num=14;
    }
}
console.log("global num ",g_num);
console.log(Numbers.sval);
var obj = new Numbers();
console.log("global num: ",obj.num_val);