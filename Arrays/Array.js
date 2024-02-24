const strings = ["a", "b", "c", "d", "e"];

// push
strings.push("f"); // O(1)    simply adding at last index , does not loop through whole array
//pop
strings.pop(); // O(1)

//unshift
strings.unshift("x"); // O(n)    adding at first index , loop through whole array , changes positions

//splice
strings.splice(2, 1, "y"); // O(n)

console.log(strings);

console.log(this);
