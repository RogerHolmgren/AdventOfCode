#!/usr/bin/python
def is_triangle(t):
    a = int(t[0])
    b = int(t[1])
    c = int(t[2])
    return (a+b>c) and (a+c>b) and (c+b>a)

# Start of program
possible = []
total = []
my_input = open('input.txt', 'r')
#my_input = ["5 10 25","4 4 24"]
for sides in my_input:
    t = sides.split()
    if is_triangle(t) :
        possible.append(t)
    total.append(t)
my_input.close()
print("Valid triangles: {}".format(len(possible)))
print("Total inputs : {}".format(len(total)))


