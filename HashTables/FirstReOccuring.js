// given array = [2, 1, 2, 4, 6, 8, 8, 9, 2]
// should return 2 , as 2 reccourred first

// first approach // slower
function FirstReOccuringCharacter(input) {
  // good space complexity , bad time complexity
  for (let i = 0; i < input.length; i++) {
    for (let j = i + 1; j < input.length; j++) {
      if (input[i] === input[j]) {
        return input[j];
      }
    }
  }
  return undefined;
} //O (n^2)
function FirstReOccuringCharacter2(input) {
  // bad space complexity , good time complexity
  let map = {};
  for (let i = 0; i < input.length; i++) {
    if (map[input[i]] !== undefined) {
      return input[i];
    } else {
      map[input[i]] = i;
    }
  }
  return undefined;
} // O (n)
console.log(FirstReOccuringCharacter([2, 5, 5, 1, 2, 4, 6, 8, 8, 9, 2])); // returns 2 as we compare one character to all other characters later
console.log(FirstReOccuringCharacter2([2, 5, 5, 1, 2, 4, 6, 8, 8, 9, 2])); // returns 5 as here check the second character to all previous characters if it occured earlier
// depends on requirement choose a different approach