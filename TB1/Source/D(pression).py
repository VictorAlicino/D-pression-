import os
import tkinter as tk
from tkinter import filedialog

if __name__ == '__main__':
    root = tk.Tk()
    root.withdraw()
    file_path = filedialog.askopenfilename()
    os.system("cls")
    os.system("java D " + file_path)
    print("Fim da leitura...")
    os.system("pause")
