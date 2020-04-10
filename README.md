# Lab2
Compulsory + Optional

I solved the tasks, as it follows :
An instance of MDVSP consists of depots, vehicles and clients (trips).

Each vehicle belongs to a single depot. It starts from there and it may return there at any time.
Each client has a name and a visiting time (a number of order, starting with 1).
Each vehicle will perform a single tour, consisting of one or more trips with strictly ascending visiting times, starting from its depot and ending in it.
Each trip in the timetable must be covered by a single vehicle.
A vehicle cannot be assigned to more than one trip at any point in time.
We consider the problem of allocating trips to vehicles such that all constraints are satisfied.

Consider the following example. There are 2 depots (D1,D2), D1 has 2 vehicles (V1,V2) and D2 has one vehicle (V3). There are 5 clients C1(1),C2(1),C3(2),C4(2),C5(3) (in parenthesis are the visiting times).
A solution for this example might contain the following tours: V1: D1 -> C1 -> C3 -> C5 -> D1, V2: D1 -> C2 -> D1, V3: D2 -> C4 -> D3.

Override the equals method form the Object class for the Depot, Vehicle, Client classes. The problem should not allow adding the same depot or client twice. The depot should not allow duplicate vehicles.
Instead of using an enum, create dedicated classes for cars, trucks and drones. Vehicle will become abstract.
Implement the method getVehicles in the Problem class, returning an array of all the vehicles, form all depots.
Implement a simple algorithm for allocating trips to vehicles. Create a class to describe the solution.
Write doc comments in your source code and generate the class documentation using javadoc.
