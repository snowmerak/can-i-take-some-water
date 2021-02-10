import { Solution } from "./solution"

function test() {
    let cases: [number, string[], number][] = []
    let n = 1
    cases.forEach(c => {
        let hits = 0
        let solution = new Solution(c[0])
        c[1].forEach(s => {
            if (solution.solve(s)) {
                hits++
            }
        })
        console.log(`case ${n}: ${hits} hit`)
        n++
    })
}

test()