while True:
    try:
        str = input()
        if str == "":
            break
        print(str)
    except EOFError:
        break
