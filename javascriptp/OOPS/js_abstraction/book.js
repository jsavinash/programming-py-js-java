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
