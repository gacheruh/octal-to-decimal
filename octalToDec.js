function octalToDec(n){
    let oct = n.toString().split('').reverse()
    let dec 
    let sum = 0

    for(i = 0; i < oct.length; i++){
        dec = oct[i] * 8 ** i
        sum += dec
    }

    return sum
}

console.log(octalToDec(61))