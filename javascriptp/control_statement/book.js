var Book = function () {
  this.condition = false;
  this.method = function () {
    if (this.condition) {
      console.log("Control Condtion executed on true");
    } else {
      console.log("Control Condtion executed on false");
    }
  };
};

const newBook = new Book();
newBook.method();
newBook.condition = true;
newBook.method();
