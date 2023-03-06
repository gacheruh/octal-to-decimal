def octal_to_decimal(n):
    oct = str(n)[::-1]
    sum = 0

    for i in range(len(oct)):
        dec = int(oct[i]) * 8 ** i
        sum += dec

    return sum

print(octal_to_decimal(63))