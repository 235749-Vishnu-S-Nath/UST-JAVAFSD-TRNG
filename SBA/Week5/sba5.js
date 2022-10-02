var Student = /** @class */ (function () {
    function Student(name1, grade) {
        this.name1 = name1;
        this.grade = grade;
    }
    Student.prototype.display = function () {
        console.log("Name: ", this.name1);
        console.log("Grade: ", this.grade);
    };
    return Student;
}());
var obj2 = new Array(new Student("Vishnu", 10), new Student("Ashiq", 10), new Student("Vyshak", 10), new Student("Haridev", 10));
for (var i = 0; i < obj2.length; i++) {
    console.log("Details of student No:", i + 1);
    obj2[i].display();
}
