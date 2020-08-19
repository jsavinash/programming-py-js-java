var Book = function () {
  var data = 50; // instance variable
  var method = function () {
    var n = 90; // local variable
    return n;
  };
};

const newBook = new Book();
console.log("Instance variable" + " " + newBook.data);
console.log("Local variable" + " " + newBook.method());
