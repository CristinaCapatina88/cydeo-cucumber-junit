Feature: As a user, I should be able to remove files from favorites and upload a file directly
  @removefav
  Scenario Outline: verify users to remove files to Favorites
    Given user enters "<username>" and "<password>" in the log in page
    When the user clicks the Files module
    When the users click action-icon from any file on the page to remove
    And  user choose the Remove from favorites option
    And user click the Favorites sub-module on the left side
    Then Verify that the file is removed from the Favorites sub-module’s table
    Examples:credentials
      | username | password    |
      | user7    | Userpass123 |
    |user37    |Userpass123  |
    |user67    |Userpass123  |

@upload
Scenario Outline: verify users to upload a file from Files
  Given user enters "<username>" and "<password>" in the log in page
    When the user clicks the Files module
    When the user clicks the add icon on the top
  And users uploads "<file>" with the upload file option
  Then verify the "<filename>" is displayed on the page

  Examples:credentials
    | username | password    | file                                    | filename |
    | user7    | Userpass123 | C:\\Users\\roman\\Desktop\\PIC.png      | PIC      |
    | user37   | Userpass123 | C:\\Users\\roman\\Desktop\\IMG_7897.jpg | IMG_7897 |
    | user67   | Userpass123 | C:\\Users\\roman\\Desktop\\locators.png | locators |



