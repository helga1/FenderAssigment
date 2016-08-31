# FenderAssigment

dependencies:
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>2.27.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-support</artifactId>
            <version>2.27.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-firefox-driver</artifactId>
            <version>2.27.0</version>
        </dependency>
        
Dependencies can be installed automatically by maven.

How to run test locally:
* import FenderAssignment into the IDE, such as intelliJ or eclipse
* open Checkout.java
* run the "main" method

If I had more time: 
1Create all customize Xpath's for every element (this time I also customized Xpath's but not for every element).
2Consider to use CSS, id or other lightweight locators in some cases, in order to speed up the test execution.
3Write comment for every step of the test case.
4It is good practice to use page object pattern instead hard coding.


Fender (AMERICAN ELITE STRATOCASTER® HSS SHAWBUCKER)
http://shop.fender.com/en-US/electric-guitars/stratocaster/american-elite-stratocaster-hss-shawbucker/0114110723.html

1. ‘Fender logo’ button. Button should lead user to the home page.
2. ‘Facebook’ button. The result of the clicking on this button depends of the precondition:
    IF user is logged in to Facebook- Then ‘Share on Facebook’ window appears (with guitar picture    +info), user can have access to ‘Share on your timeline’, ‘Post on Facebook’ and ‘Cancel buttons.
    IF user is not logged in to Facebook- Then ‘log in’ window should appear, before user will be able to share the data.
3. Twitter button the result of the clicking on this button depends of the precondition:
    IF user is logged in to Twitter- Then ‘Twitter’ window appears (with guitar picture +info), user can share the data.
    IF user is not logged in to Twitter- Then ‘log in’ + ‘sign up’ window should appear, before user will  be able to share the data.
4. Share button (‘+’ button) should lead to the SHARE window, where user can choose the service to
  share the data, expand the list of services that are not in the top list of services, search services.
5. Verify that 5 Header buttons ( ‘Products’, ‘Customize”, ‘Music’, ‘Play’, ‘Connect’) . Products’, ‘Customize” and ‘Connect’ open the menus when hover over or click on them. ”, ‘Music’, ‘Play’ buttons are links, that leads to the relate pages.
6. ‘Color’ + ‘Fingerboard material’ buttons should change the guitar primary main image (according to the users choice of color and fingerboard material+ their combinations). If user chooses any other image from image carousel and change the color and/or fingerboard material, the image changes to the main image, where user can see applied materials.
7. When user hover over the image (main or image, that was chosen from the image carousel), the picture zooms.
8. ‘Add to card’ button allows user to add the item to the shopping cart. Once it is added, the ‘view cart’ drops down appears, and user can see the details (name, price, quantity, image that appears with chosen materials and color, model info such as color and fingerboard material)
9. ‘Add to wish list’. The behavior of this button depends of 2 conditions.
    * IF user does not logged in or does not have an account. Than the ‘Add to wish list’ button leads to the window, where user can log in or create an account (buy clicking on ‘Create an account’ button) before he can add something into wish list.
    * IF user is have an account and is logged in, the ‘Add to wish list’ button leads to the ‘wish list’ page, where user sees that particular guitar is added to. 
10. ‘Play one’ button make the modal window appear, where user can search the dealer by city of zip code or can click ‘use my current location’ button. 
11. Image carousel. User can look over the images (left or right) by clicking the arrow buttons.
12. Image carousel.  If user clicked on particular image within this section, the corresponding image as the main image.
13. ‘Highlights’ button. Clicking on this button opens the data with pictures of guitar parts with description of them (within the page).
14. ‘Specs’ button opens the specification of the guitar (within the page).
15. ‘Support’ button opens 3 links, which should lead to corresponding pages (1-FENDER® ELECTRIC INSTRUMENT LIMITED LIFETIME WARRANTY, 2-Manual, 3-Parts layout)
16. ‘Recommended gear’ image carousel. Should be controlled by clicking on left/right arrows.
17. ‘Recommended gears’ (links) should lead to the proper page.
18. ‘Back to top’ button should lead to the top of the page.
19. Footer links should lead to the proper pages and change the color when hover over.

Note: This test plan is not based on known requirements, but my assumptions. That means some inaccuracies may be admitted.





