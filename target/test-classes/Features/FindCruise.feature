Feature: Filter Cruise this is a test
  this test is to test if this test works right
  @test
  Scenario:  Client filters cruises by date on ncl.com

   Given  client searches for sailings on first available month
   And    cruise counter on filter updates
   When   filtered list of cruises is displayed
   Then   all displayed cruises should start on selected month
   And    number of displayed cruises should match previous counter on filter