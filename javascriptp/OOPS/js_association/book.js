var Book = function (name) {
  this.name = name;
};

var Library = function (name) {
  this.name = name;
  this.books = [];
  this.getLibrary = function () {
    console.log("Library::", this.name);
  };
  this.addBook = function (book) {
    this.books.push(book);
  };
  this.getBook = function () {
    this.books.forEach((book, idx) => {
      console.log(idx, ".", book.name);
    });
  };
};

var l1 = new Library("Cloud Library");
var b1 = new Book("Blue Star");
var b2 = new Book("Megatron");
l1.addBook(b1);
l1.addBook(b2);
l1.getLibrary();
l1.getBook();
