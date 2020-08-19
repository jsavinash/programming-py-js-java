var Book = function () {
  this.data = 50; // instance variable
  this.method = function () {
    var n = 90; // local variable
    return n;
  };
};

const newBook = new Book();
console.log(newBook);
console.log("Instance variable" + " " + newBook.data);
console.log("Local variable" + " " + newBook.method());
