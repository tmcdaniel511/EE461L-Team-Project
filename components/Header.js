import React from "react"
import 'bootstrap/dist/css/bootstrap.min.css'
import "../App.css"
import logo from "../images/logo.jpg"
import { Link } from 'react-router-dom';
import headerImg from "../images/headerImg.jpeg"


const navBar = {
    backgroundColor: "black",
    height:"130px"
};

const modelLink = {
    color: "yellow",
    textAlign: "center",
    fontFamily: "Chilanka",
};

const logoBlock = {
    display: "block",
    maxHeight: "130px",
    maxWidth: "200px",
    height: "auto",
    width: "auto",
    paddingBottom: "20px"
};

const logIn = {
    fontFamily: "Calibri"
};



const Header = () => {
    return (
        <div>
            <nav className="navbar" style={navBar}>

                <Link to={"/recipes"}><a className="navbar-brand" style={modelLink}>Pokedex</a></Link>
                <Link to={"/news"}> <a className="navbar-brand" style={modelLink}>Moves</a> </Link>
                <Link to={"/restaurants"}> <a className="navbar-brand" style={modelLink}>Abilities</a> </Link>

                <Link to={"/"}><img src={logo} className="navbar-brand" style={logoBlock}/></Link>
                <Link to={"/delivery"}> <a className="navbar-brand" style={modelLink}>Items</a> </Link>
                <Link to={"/aboutus"}> <a className="navbar-brand" style={modelLink}>About Us</a> </Link>
                <button className="btn-sm btn-success">Log In</button>
            </nav>
        </div>

    )
}

export default Header
