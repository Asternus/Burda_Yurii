![This is an image](https://media.proglib.io/wp-uploads/2019/03/java-1.jpg)

<h1 align="center" style="color:Gray">Поиск прыжками</h1>

Основным <ins> отличием</ins> от двоичного поиска у данного алгоритма является **движение вперед**. Для использования данного поиска необходимо, чтобы коллекция была **отсортирована**. 

Мы прыгаем вперёд на интервал **`sqrt(arraylength)`**, пока не достигнем элемента большего, чем текущий элемент или конца массива. При каждом прыжке записывается предыдущий шаг.

***Прыжки прекращаются, когда найден элемент больше искомого. Затем запускаем линейный поиск между предыдущим и текущим шагами***. 

Это уменьшает поле поиска и делает линейный поиск жизнеспособным вариантом. :monocle_face:

# Поиск выглядит следующим образом: 

```
public static int jumpSearch(int[] integers, int elementToSearch) {

    int arrayLength = integers.length;
    int jumpStep = (int) Math.sqrt(integers.length);
    int previousStep = 0;

    while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
        previousStep = jumpStep;
        jumpStep += (int)(Math.sqrt(arrayLength));
        if (previousStep >= arrayLength)
            return -1;
    }
    while (integers[previousStep] < elementToSearch) {
        previousStep++;
        if (previousStep == Math.min(jumpStep, arrayLength))
            return -1;
    }

    if (integers[previousStep] == elementToSearch)
        return previousStep;
    return -1;
}
```

Начинается поиск с **`jumpstep`** который размером с √ от длины массива, продолжаем «прыгать» вперед с тем же размером, пока не найдём элемент, который будет таким же или больше искомого элемента.

Сначала проверяется элемент **`integers[jumpStep]`**, затем **`integers[2jumpStep]`**, **`integers[3jumpStep]`** и так далее. Проверенный элемент сохраняется в переменной **`previousStep`**.

Когда найдено значение, при котором **`integers[previousStep] < elementToSearch < integers[jumpStep]`**, производится линейный поиск между **`integers[previousStep]`** и **`integers[jumpStep]`** или элементом большим, чем **`elementToSearch`**.

# алгоритм реализуется:

```
int index = jumpSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);  
print(67, index);
```

**консоль**:
```
67 found at Index 5
```

> **Поскольку в каждой итерации мы перепрыгиваем на шаг, равный √ (arraylength), Big O(sqrt (N)).** :100:

- Этот поиск используется поверх бинарного поиска, когда прыжки в обратную сторону затратны.
- С ограничением сталкиваются при работе с вращающейся средой. Когда при легком поиске по направлению вперёд многократные прыжки в разных направлениях становятся затратными.

[Более подробно про другие поиски](https://www.examclouds.com/ru/java/java-core-russian/algoritm-poisk-elementa).
