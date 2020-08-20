//Strong Coupling
var Book = function (name, cost, author) {
  this.name = name;
  this.cost = cost;
  this.author = author;
};

var Knowledge = function (name, cost, author, pages) {
  Book.call(this, name, cost, author);
  this.pages = pages;
};

var k1 = new Knowledge("Blue Ocean", 20, "Avinash Nishad", 20);
console.log("k1", k1.author);

//Weak Coupling
function Vehicle() {
  this.vehicleName;
  throw new Error("You cannot create an instance of Abstract Class");
}

Vehicle.prototype.display = function () {
  return "Vehicle is: " + this.vehicleName;
};

//Creating a constructor function
function Bike(vehicleName) {
  this.vehicleName = vehicleName;
}

//Creating object without using the function constructor
Bike.prototype = Object.create(Vehicle.prototype);
var bike = new Bike("Honda");
console.log("bike", bike);
console.log("bike", bike.display());
