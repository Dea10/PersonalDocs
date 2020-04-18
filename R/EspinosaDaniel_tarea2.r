#### 2. Crea un vector de 10,000 números aleatorios que siguen una distribución normal(mean = 0, var = 1) y guardalo en la variable x.

myNumberOfValues <- 10000
myMean <- 0
myVar <- 1

x <- rnorm(myNumberOfValues, myMean, myVar)

#### 3. Calcula la media de la variable x y guárdala a la variable x_mean

x_mean <- mean(x)
x_mean

#### 4. Ordena los valores de la variable x de menor a mayor y guárdala en la variable x_sort

x_sort <- sort(x)
x_sort[0:5]

x_sort[9995:10000]

#### 5. Repite la pregunta 1, pero en lugar de guardar los número en la variable x guárdala en la variable y, una vez creada la variable y (tiene que tener 10,000 número).

y <- rnorm(myNumberOfValues, myMean, myVar)

for(i in 1:myNumberOfValues) {
    xy_pmin[i] <- min(x[i],y[i])
}

xy_pmin
