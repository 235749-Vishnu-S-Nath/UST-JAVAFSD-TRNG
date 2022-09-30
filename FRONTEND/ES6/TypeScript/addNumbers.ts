function addNumber(...num:number[]){
    var i;
    var sum:number=0;
    for(i=0;i<num.length;i++){
        sum=sum+num[i];
    }
    console.log("Sum of the numbers: ",sum);
}
addNumber(1,2,3);
addNumber(10,10,10,10,10);