class Chocolateboiler:

    __chocolateboiler = None

    def __init__(self):
        self.__empty = True
        self.__boiled = False
        print('A caldeira está vazia')

    @staticmethod
    def create_chocolate_boiler(self):
        if Chocolateboiler.__chocolateboiler is None:
            Chocolateboiler.__chocolateboiler = Chocolateboiler()
        else:
            return Chocolateboiler.__chocolateboiler


if __name__ == "__main__":
    choco1 = Chocolateboiler().create_chocolate_boiler
    choco2 = Chocolateboiler().create_chocolate_boiler

    if choco1 == choco2:
        print('deu bom')
    else:
        print('partiu próxima tentativa :p')
