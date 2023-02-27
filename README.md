# Project 2: PacMan

## Team 5
- Andrew Liu
- Malchu Pascual
- Sahil Goel
- Saketh Kura

## Running the Code from Command Line

### Navigating to the Right Directory
- Make sure that you are in the P2 directory

### Compiling the source and test code

```bash
gradle build
```

### Running the StartMenu

```bash
gradle run
```

## PacMan in Action

### Below is an image of our PacMan game being played

## PacMan Class Implementation

### get_valid_moves()
- **Description:**

### move()
- **Description:** We first check to see if there are any valid moves. If there are no valid moves, we return false. Otherwise, we take the first possible valid move and execute that move by invoking the move() method from Map and updating the pacman's location if the move was successful. If the move was successful, we return true. Otherwise, we return false. The test case invokes a game, instantiates a pacman, and then throws an exception if the expected functionality does not occur.

### is_ghost_in_range()
- **Description:** We first identified possible locations of ghost in range, that is north, south, west, and east. We then obtained the types of objects at each given location using the getLoc() method from Map.java. Finally, we check to see if north, south, west, or east contains the type Map.Type.GHOST,  if so then we return true. Otherwise there are no ghost in range so we return false.

### consume()
- **Description:**

## Ghost Class Implementation

### get_valid_moves()
- **Description:**

### move()
- **Description:** We first check to see if there are any valid moves. If there are no valid moves, we return false. Otherwise, we take the first possible valid move and execute that move by invoking the move() method from Map and updating the ghost's location if the move was successful. If the move was successful, we return true. Otherwise, we return false. The test case invokes a game, instantiates a ghost, and then throws an exception if the expected functionality does not occur.

### is_pacman_in_range()
- **Description:** We first identified possible locations of pacman in range, that is north, south, west, and east. We then obtained the types of object at each given location using the getLoc() method from Map.java. Finally, we check to see if north, south, west, or east contains the type Map.Type.PACMAN,  if so then we return true. Otherwise there are no pacman in range so we return false.

### attack()
- **Description:**

## Map Class Implementation

### move(String name, Location loc, Type type)
- **Description:**

### getLoc(Location loc)
- **Description:** We check the field variable at the given location to see if there have been any types added to that location. If there is no key associated with that location, then we know the location is empty so we return an empty set. Otherwise, we return the value of the location key in the field variable to get the set of types that exist at the specified location. The test case invokes a game, instantiates a pacman, and then throws an exception if the set returned from getLoc does not contain the PACMAN type.

### attack(String name)
- **Description:** We first obtain information on whether a ghost exist or not by passing the ghost name as argument in the get() method from hashmap. If the result from the get method is null, that means the corresponding ghost does not exist so we return false. Otherwise the ghost exist, and we begin to identify possible valid locations of pacman in range. We then check if each possible locations actually contains pacman instances, if so then we update gameOver to true and return true, otherwise we do not attack and just return false.

### eatCookie(String Name)
- **Description:**

