var Book = function () {
  this.condition = "a";
  this.loop = function () {
    for (var i = 0; i < 10; i++) {
      console.log("Loop::", i);
    }
  };
  this.while = function () {
    var i = 0;
    while (i < 10) {
      i++;
      console.log("*******************");
    }
    console.log("While loop completed");
  };
  this.doWhile = function () {
    var i = 0;
    do {
      i++;
      console.log("*******************");
    } while (i < 10 && i > 0);
    console.log("Do while loop completed");
  };
};

const newBook = new Book();
newBook.loop();
newBook.while();
newBook.doWhile();
