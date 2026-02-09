import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from pandas.core.common import random_state
from sklearn.learn_model import LinearRegression
from sklearn.metrics import mean_squared_error

df_sal=pd.read_csv("Salary_Data.csv")
df_sal.head()