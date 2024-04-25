var TimeLimitedCache = function () {
  this.cache = new Map();
};

TimeLimitedCache.prototype.set = function (key, value, duration) {
  const isPresent = this.cache.has(key);

  if (isPresent) {
    clearTimeout(this.cache.get(key).timekey);
  }
  const timekey = setTimeout(() => {
    this.cache.delete(key);
  }, duration);

  this.cache.set(key, { value, timekey });
  return isPresent;
};

TimeLimitedCache.prototype.get = function (key) {
  if (this.cache.has(key)) {
    return this.cache.get(key).value;
  } else {
    return -1;
  }
};

TimeLimitedCache.prototype.count = function () {
  return this.cache.size;
};
