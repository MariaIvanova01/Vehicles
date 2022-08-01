# Vehicles

Use your solution to the previous task for a starting point and add more functionality.Add new vehicle – Bus. Now every vehicle has tank capacity and fuel quantity cannot fall (set) below 0 (If fuel quantity becomes less than 0 print on the console "Fuel must be a positive number").
The vehicles cannot be filled with fuel more than their tank capacity. If you try to put more fuel in the tank than the available space, print on the console "Cannot fit fuel in tank" and do not add any fuel to the vehicle's tank.
Add new command for the bus. The bus can drive with or without people. If the bus is driving with people, the air-conditioner is turned on and its fuel consumption per kilometer is increased by 1.4 liters. If there are no people on the bus when driving the air-conditioner is turned off and does not increase the fuel consumption.

Input
--------------

•	On the first three lines you will receive information about the vehicles in the format:

Vehicle {initial fuel quantity} {liters per km} {tank capacity}

•	On the fourth line - a number of commands N will be given on the next N lines.

•	On the next N lines – commands in format:

o	Drive Car {distance}

o	Drive Truck {distance}

o	Drive Bus {distance}

o	DriveEmpty Bus {distance}

o	Refuel Car {liters}

o	Refuel Truck {liters}

o	Refuel Bus {liters}

Output
---------------------

•	After each Drive command print whether the Car/Truck was able to travel a given distance in format if it’s successful: "Car/Truck/Bus travelled {distance} km".

•	If the command is invalid - do nothing.

•	Or if it is not: "Car/Truck/Bus needs refueling".

•	If given fuel is ≤ 0 print: "Fuel must be a positive number".

•	If given fuel cannot fit in car or bus tank print: "Cannot fit fuel in tank".

•	Finally, print the remaining fuel for a car, truck and bus rounded 2 digits after a floating point in the format:

"Car: {liters}

Truck: {liters}

Bus: {liters}"

Input |	Output
------|--------
Car 30 0.04 70| Fuel must be a positive number
Truck 100 0.5 300 | Fuel must be a positive number
Bus 40 0.3 150 | Cannot fit fuel in tank
8 | Bus travelled 10 km
Refuel Car -10 | Cannot fit fuel in tank
Refuel Truck 0 | Bus needs refueling
Refuel Car 10 | Cannot fit fuel in tank
Refuel Car 300 | Car: 40.00
Drive Bus 10 | Truck: 100.00
Refuel Bus 1000 | Bus: 23.00
DriveEmpty Bus 100 |
Refuel Truck 1000 |	
