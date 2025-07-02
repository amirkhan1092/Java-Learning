import random

# Fake OpenAI.chat function for humor
def openai_chat(prompt, error_msg):
    fixes = [
        "Have you tried turning it off and on again?",
        "Maybe the server is on a coffee break. Try again later.",
        "Error code 404: Sense of humor not found.",
        "Did you forget to sacrifice a goat to the coding gods?",
        "This error is caused by a missing semicolon. Just kidding! Or am I?",
        "The error is in the computer. Have you tried yelling at it?",
        "This is not a bug; it's a feature in disguise.",
        "The error is caused by a cosmic ray flipping a bit in your RAM. Try again.",
        "Have you tried asking Stack Overflow?",
        "The error is due to a lack of pizza in the developer's stomach.",
    ]

    # Return a random funny fix
    return f"{prompt}{error_msg}\nFix: {random.choice(fixes)}"

# Simulated login function
def login(username, password):
    try:
        # Simulate a login check
        if not username or not password:
            raise ValueError("Username or password cannot be empty.")

        if username != "admin" or password != "password123":
            raise ValueError("Invalid username or password.")

        # If login is successful
        print("Login successful! Welcome, admin!")
    except ValueError as error:
        # Handle errors with humor
        fix = openai_chat("Error: ", str(error))
        print(fix)

# Test the login function
login("", "")  # Empty username and password
login("user", "wrongpassword")  # Invalid credentials
login("admin", "password123")  # Successful login