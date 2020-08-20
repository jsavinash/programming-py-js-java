var Square = function () {
  this.area = function (a) {
    return a * a;
  };
};

var Geometry = function (a) {
  var sq = new Square();
  this.area = function () {
    return sq.area(a);
  };
};

var g1 = new Geometry(2);
console.log("g1", g1.area());
