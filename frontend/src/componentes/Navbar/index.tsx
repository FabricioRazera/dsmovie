import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styler.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="RazeraMovies-nav-content">
                    <h1>Razera Movies</h1>
                    <a href="https://github.com/devsuperior">
                        <div className='RazeraMovies-conteiner'>
                            <GithubIcon />
                            <p className='Razera-contact-link'>/devsuperior</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>

    )
}
export default Navbar;