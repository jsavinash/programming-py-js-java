var Book = function () {
  this.condition = "a";
  this.method = function () {
    switch (this.condition) {
      case "a":
        console.log("Case Rendered");
        break;
      default:
        console.log("Default Rendered");
    }
  };
};

const newBook = new Book();
newBook.method();
newBook.condition = "b";
newBook.method();
