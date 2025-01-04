Purpose:
To calculate the average weekly and monthly grocery bill for a family of four, both with and without a coupon discount.

Steps:
Initialize Program:

Import necessary library (Scanner) for user input.
Create variables for:
Coupon amount.
Weekly grocery bills (array of size 4).
Monthly total and weekly average.
Prompt User for Coupon Amount:

Display message: "Enter the coupon amount as a decimal (e.g., 0.10)."
Store user input in couponAmount.
Validate Coupon Amount:

If couponAmount <= 0 OR couponAmount > 1:
Display message: "Invalid coupon amount. Setting coupon to 10%."
Set couponAmount = 0.10.
Collect Weekly Grocery Bills:

Initialize monthlyTotal to 0.
Loop through weeks 1 to 4:
Display message: "Enter grocery bill for week [week number]."
Store user input in the corresponding array index.
Add the weekly bill to monthlyTotal.
Calculate Totals and Averages:

Calculate weeklyAverage = monthlyTotal / 4.
Calculate discountedMonthlyTotal = monthlyTotal * (1 - couponAmount).
Calculate discountedWeeklyAverage = discountedMonthlyTotal / 4.
Display Results:

Display:
"Monthly Total (without coupon): [monthlyTotal]"
"Weekly Average (without coupon): [weeklyAverage]"
"Monthly Total (with coupon): [discountedMonthlyTotal]"
"Weekly Average (with coupon): [discountedWeeklyAverage]"
End Program.
