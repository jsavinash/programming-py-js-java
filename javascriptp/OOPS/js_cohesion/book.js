var Book = function () {
  this.add = function (num) {
    return num + 2;
  };

  this.substract = function (num) {
    return num - 2;
  };

  this.multiple = function (num) {
    return num * 2;
  };

  this.divide = function (num) {
    return num / 2;
  };

  this.weaklyCohesive = function (num) {
    return this.divide(this.multiple(this.substract(this.add(num))));
  };

  this.highlyCohesive = function (num) {
    return ((num + 2 - 2) * 2) / 2;
  };
};

var b1 = new Book();
console.log("highlyCohesive", b1.highlyCohesive(2));
console.log("weaklyCohesive", b1.weaklyCohesive(2));
