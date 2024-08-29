# Install and load necessary packages
# install.packages(c("shiny", "ggplot2"))

library(shiny)
library(ggplot2)

# Sample data (replace this with your actual data)
my_data <- read.csv()

# Define UI
ui <- fluidPage(
  titlePanel("Soccer Stats Dashboard"),
  
  sidebarLayout(
    sidebarPanel(
      # Add any input elements or controls if needed
    ),
    
    mainPanel(
      tabsetPanel(
        tabPanel("Pie Chart", plotOutput("pie_chart")),
        tabPanel("Yellow Cards vs. Fouls", plotOutput("yellow_cards_fouls")),
        tabPanel("Average Goals", plotOutput("average_goals")),
        tabPanel("Team Goals vs. Team Corners", plotOutput("team_goals_corners")),
        tabPanel("Total Fouls vs. Total Freekicks", plotOutput("fouls_freekicks")),
        tabPanel("Goals vs. Assists (Team 1)", plotOutput("goals_assists_team1")),
        tabPanel("Goals vs. Assists (Team 2)", plotOutput("goals_assists_team2")),
        tabPanel("Team Attempts vs. Team Goals", plotOutput("attempts_goals"))
      )
    )
  )
)

# Define server

  
  output$yellow_cards_fouls <- renderPlot({
    plot(x = my_data$total_fouls, y = my_data$total_yellow_cards, main = "Yellow Cards vs. Fouls",
         xlab = "Fouls", ylab = "No. of Yellow Cards", col = "darkblue")
  })
  
  output$average_goals <- renderPlot({
    boxplot(x = my_data$team_goals, main = "Average Goals in the Match", xlab = "No. of Goals")
  })
  
  output$team_goals_corners <- renderPlot({
    barplot(height = my_data$team_goals, names.arg = my_data$team_corners, 
            xlab = "Team Corners", ylab = "Team Goals", col = "pink")
  })
  
  output$fouls_freekicks <- renderPlot({
    barplot(height = my_data$total_freekicks, names.arg = my_data$total_fouls, 
            xlab = "Total Fouls", ylab = "Total Freekicks", col = "grey")
  })
  
  output$goals_assists_team1 <- renderPlot({
    barplot(height = my_data$number.of.goals.team1, names.arg = my_data$assists.team1, 
            xlab = "Assists", ylab = "No. of Goals", col = "red")
  })
  
  output$goals_assists_team2 <- renderPlot({
    barplot(height = my_data$number.of.goals.team2, names.arg = my_data$assists.team2, 
            xlab = "Assists", ylab = "No. of Goals", col = "red")
  })
  
  output$attempts_goals <- renderPlot({
    barplot(height = my_data$team_attempts_number, names.arg = my_data$team_goals, 
            xlab = "Goals", ylab = "Attempts", col = "orange")
  })
}

# Run the app
shinyApp(ui = ui, server = server)
