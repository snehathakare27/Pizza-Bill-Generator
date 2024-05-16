# Pizza-Bill-Generator-App
## Project Use Eclipse IDE

### BasePizza : 	
    	- Veg = 50K IDR.
		- Non-Veg = 70K IDR.
	add extra :
		- Cheese = 15K IDR.
		- Topping = 20K IDR.
	Take away : +5K IDR for package.

=================================================

### DeluxPizza :	
    - all in base pizza included automatically except takeaway.

==================================================

## Approach:

### Class Pizza :
	- Constructor (Veg/Non-Veg)
	- addExtraCheese ()
	- addExtraToppings()
	- addTakeAway()
	- getBill()

### Class DeluxPizza Inherite Pizza:
	- Constructor(Veg/Non-Veg) + addExtraCheese() + addExtraTopping;
	- Override addExtraCheese() empty statement
	- Override addExtraToppings() empty statement

## OUTPUT
#### Pizza		  : Rp50.000,00
#### Cheese 		: Rp15.000,00
#### Topping		: Rp20.000,00
#### Take Away	: Rp5.000,00
#### Bill			: Rp90.000,00
