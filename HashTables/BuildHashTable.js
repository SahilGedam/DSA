class HashTable {
  constructor(size) {
    this.data = new Array(size);
  }
  _hash(key) {
    let hash = 0;
    for (let index = 0; index < key.length; index++) {
      hash = (hash + key.charCodeAt(index) * index) % this.data.length;
    }
    return hash;
  }
  get(key) {
    let address = this._hash(key);
    const currentBucket = this.data[address];
    //console.log(currentBucket);
    if (currentBucket) {
      for (let index = 0; index < currentBucket.length; index++) {
        if (currentBucket[index][0] === key) {
          return currentBucket[index][1];
        }
      }
    }
  }
  set(key, value) {
    let address = this._hash(key);
    if (!this.data[address]) {
      this.data[address] = [];
    }
    this.data[address].push([key, value]);
    // console.log(this.data);
  }

  keys(){
    const keysArray = [];
    for (let index = 0; index < this.data.length; index++) {
        if (this.data[index]) {
            keysArray.push(this.data[index][0][0]);
        }
        
    }
    return keysArray;
  }
}
const myHash = new HashTable(20);
myHash.set("grapes", 1000);
myHash.set("apple", 3000);
myHash.set("mango", 1000);
;
console.log(myHash.get("apple"));
console.log(myHash.keys());
