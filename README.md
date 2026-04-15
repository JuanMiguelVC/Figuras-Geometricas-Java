# Figuras Geométricas en Java

## 📖 Descripción

Este es un proyecto educativo de **Programación Orientada a Objetos (POO) con Java** que implementa un catálogo completo de figuras geométricas. El objetivo es demostrar los principios de herencia, polimorfismo y encapsulación mediante la creación de clases para diferentes tipos de figuras.

El proyecto permite **calcular propiedades geométricas** como área, perímetro y volumen de diversas figuras, tanto en 2D como en 3D.

---

## 📁 Estructura del Proyecto

El código está organizado en **cinco categorías principales**, cada una en su propia carpeta:

### 1. **triangulos/** - Figuras Triangulares
- `TrianguloEquilatero.java` - Triángulo con todos los lados iguales
- `TrianguloIsoceles.java` - Triángulo con dos lados iguales
- `TrianguloEscaleno.java` - Triángulo con todos los lados diferentes
- `FiguraGeometricaTriangular.java` - Clase base para triángulos
- `CatalogoFGTriangulos.java` - Catálogo y utilidades para triángulos

### 2. **cuadrilateros/** - Figuras de Cuatro Lados
- `Cuadrado.java` - Cuadrado (cuatro lados iguales)
- `Rectangulo.java` - Rectángulo (lados opuestos iguales)
- `Rombo.java` - Rombo (lados iguales, ángulos diferentes)
- `Trapecio.java` - Trapecio (un par de lados paralelos)
- `FiguraGeometricaCuadrilatero.java` - Clase base para cuadriláteros
- `CatalogoFGCuadrilateros.java` - Catálogo y utilidades para cuadriláteros

### 3. **figuras-regulares/** - Polígonos Regulares
- `Pentagono.java` - Pentágono regular (5 lados)
- `Hexagono.java` - Hexágono regular (6 lados)
- `Heptagono.java` - Heptágono regular (7 lados)
- `Octogono.java` - Octógono regular (8 lados)
- `Nonagono.java` - Nonágono regular (9 lados)
- `Decagono.java` - Decágono regular (10 lados)
- `FiguraGeometricaRegular.java` - Clase base para polígonos regulares
- `CatalogoFGRegulares.java` - Catálogo y utilidades para polígonos regulares

### 4. **figuras-curvas/** - Figuras Curvas
- `Circulo.java` - Círculo
- `Elipse.java` - Elipse
- `FiguraGeometricaCurva.java` - Clase base para figuras curvas
- `CatalogoFGCurva.java` - Catálogo y utilidades para figuras curvas

### 5. **figuras-volumen/** - Figuras Tridimensionales
- `Cubo.java` - Cubo
- `Cilindro.java` - Cilindro
- `Esfera.java` - Esfera
- `Cono.java` - Cono
- `Pirámide.java` - Pirámide
- `Prisma.java` - Prisma
- `Tetraedro.java` - Tetraedro regular
- `Figura3D.java` - Clase base para figuras 3D
- `CatalogoFigurasGeometricas3D.java` - Catálogo y utilidades para figuras 3D

---

## 🌟 Características

✅ **Herencia**: Cada figura hereda de una clase base específica según su tipo

✅ **Polimorfismo**: Métodos sobrescritos para calcular propiedades geométricas

✅ **Encapsulación**: Atributos privados y métodos públicos para acceso controlado

✅ **Cálculos Precisos**: 
   - Área y perímetro para figuras 2D
   - Área, perímetro y volumen para figuras 3D

✅ **Catálogos**: Clases dedicadas para gestionar y organizar figuras por categoría

---

## 🎓 Uso Educativo

Este proyecto es ideal para aprender y practicar:
- Conceptos de POO en Java
- Jerarquías de clases
- Métodos abstractos y concretos
- Gestión de propiedades geométricas
- Organización de código en paquetes

---

## English

### Main Description

This is an educational project on **Object-Oriented Programming (OOP) with Java** that implements a complete catalog of geometric figures. The purpose is to demonstrate the principles of inheritance, polymorphism, and encapsulation by creating classes for different types of figures.

### Project Structure

The code is organized into **five main categories**, each in its own folder:

- **triangulos/** - Triangular figures (equilateral, isosceles, scalene)
- **cuadrilateros/** - Quadrilateral figures (square, rectangle, rhombus, trapezoid)
- **figuras-regulares/** - Regular polygons (pentagon through decagon)
- **figuras-curvas/** - Curved figures (circle, ellipse)
- **figuras-volumen/** - Three-dimensional figures (cube, cylinder, sphere, cone, pyramid, prism, tetrahedron)

Each category includes:
- Individual classes for each figure
- A base class for the figure type
- A catalog class for management and utilities

---
