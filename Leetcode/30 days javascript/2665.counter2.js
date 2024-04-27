/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
  let counter = init;
  return {
    increment: () => {
      counter = counter + 1;
      return counter;
    },
    decrement: () => {
      counter = counter - 1;
      return counter;
    },
    reset: () => {
      counter = init;
      return counter;
    },
  };
};

const counter = createCounter(5);
counter.increment(); // 6
counter.reset(); // 5
counter.decrement(); // 4
