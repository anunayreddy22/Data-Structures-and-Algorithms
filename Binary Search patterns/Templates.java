
Template-1

// minimize x such that condition(x) is true
function binarySearch(arr) {
  // decide what is the search space
  // hi should be able to take all possible values in the search space
  // lo points to an invalid value (the negative case of the if condition)
  let lo = -1, hi = arr.length;
  while (lo + 1 < hi) {
    let mid = lo + Math.floor((hi - lo) / 2);
    if (condition(arr, mid)) {
      hi = mid
    } else {
      lo = mid;
    }
  }

  // in minimization template, hi contains the return index
  return hi;
}


Template -2


// maximize x such that condition(x) is true
function binarySearch(arr) {
  // decide what is the search space
  // lo should be able to take all possible values in that search space
  // hi points to an invalid value (the negative case of the if condition)
  let lo = -1, hi = arr.length;
  while (lo + 1 < hi) {
    let mid = lo + Math.floor((hi - lo) / 2);
    if (condition(arr, mid)) {
      lo = mid;
    } else {
      hi = mid;
    }
  }

  // in maximization template, lo contains the return index
  return lo;
}

function condition(arr, idx) {
  // some condition on arr[idx]
  // return true or false
  return true;
}

Example
Minimization - Find first occurrance of an element in a sorted array with duplicates.
Maximization - Find last occurrance of an element in a sorted array with duplicates.
