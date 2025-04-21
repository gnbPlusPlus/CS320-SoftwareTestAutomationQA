# CS320-SoftwareTestAutomationQA
How can I ensure that my code, program, or software is functional and secure?
--
I ensure these things by developing tests that achieve at least 80% coverage of each file when run. Most functions will have multiple branches that can be tested for given different inputs (whether from the user or system). For example, variables in the Contact class have limits on length, which spawns at least three related tests to check whether an inputted length is too long, exactly at the maximum length, or shorter than the maximum length. Successful testing helps prove that input validation is working as intended--a key part of security--and that functions are working as they should.

How do I interpret user needs and incorporate them into a program?
--
User needs can be concentrated into short-form user stories, translated into high-level big picture ideas as epics, or given personality through detailed personas. Ideally, all of these methods should be used for creating a rich, detailed basis off which to develop a program for. Assuming that I've gathered user requirements successfully, I would then interpret user needs by distilling my notes into the crucial elements for design and development. From there, I would create user personas based off emerging themes in the requirements and attribute user stories to each that sum them up. These ideas, synthesized from the requirements, would be repeatedly referenced through design to ensure accurate, focused development.

How do I approach designing software?
--
I design software incrementally and intentionally. I repeatedly refer back to user stories and personas to ground myself in exactly what kind of functionality the user base needs. I write pseudocode, then reference it and adjust things as I compose modular code. For instances when the user inputs a value, like a username, I consider what tests need to be written and what steps need to be taken to check for 1) accurate functionality and 2) security. For example, if the user inputs an invalid username, how does the program react? If the input is unreasonably long, how will the program protect itself against a denial-of-service attack? Keeping these questions in mind is how I remember to write thorough tests and secure code.

