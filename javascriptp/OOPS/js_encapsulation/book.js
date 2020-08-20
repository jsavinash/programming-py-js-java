var Book = function () {
  var name = "Avinash";
  this.getBookName = function () {
    return name;
  };
};

var b1 = new Book();
console.log("name", b1.name);
console.log("getBookName", b1.getBookName());
